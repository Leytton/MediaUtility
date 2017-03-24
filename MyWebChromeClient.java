//代码片段
private class MyWebChromeClient extends WebChromeClient {

        // For Android 3.0+
        public void openFileChooser(ValueCallback<Uri> uploadMsg) {
            if (uploadFile != null) {
                uploadFile.onReceiveValue(null);
            }
            uploadFile = uploadMsg;
            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
            i.addCategory(Intent.CATEGORY_OPENABLE);
            i.setType("image/*");
            startActivityForResult(Intent.createChooser(i, "选择图片"), FILECHOOSER_RESULTCODE);
        }
        // For Android 3.0+
        public void openFileChooser(ValueCallback uploadMsg, String acceptType) {
            if (uploadFile != null) {
                uploadFile.onReceiveValue(null);
            }
            uploadFile = uploadMsg;
            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
            i.addCategory(Intent.CATEGORY_OPENABLE);
            i.setType("image/*");
            startActivityForResult(Intent.createChooser(i, "选择图片"),
                    FILECHOOSER_RESULTCODE);
        }
        // For Android 4.1
        public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
            if (uploadFile != null) {
                uploadFile.onReceiveValue(null);
            }
            uploadFile = uploadMsg;
            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
            i.addCategory(Intent.CATEGORY_OPENABLE);
            i.setType("image/*");
            startActivityForResult(Intent.createChooser(i, "选择图片"), FILECHOOSER_RESULTCODE);
        }
        //Android 5.0+
        @Override
        @SuppressLint("NewApi")
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
            if (uploadFiles != null) {
                uploadFiles.onReceiveValue(null);
            }
            uploadFiles = filePathCallback;
            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
            i.addCategory(Intent.CATEGORY_OPENABLE);
            if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null
                    && fileChooserParams.getAcceptTypes().length > 0) {
                i.setType(fileChooserParams.getAcceptTypes()[0]);
            } else {
                i.setType("image/*");
            }
            startActivityForResult(Intent.createChooser(i, "选择图片"), FILECHOOSER_RESULTCODE);
            return true;
        }

    }
