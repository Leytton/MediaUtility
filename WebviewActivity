 public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        Uri result = intent == null || resultCode != RESULT_OK ? null : intent.getData();
        if(uploadFile==null && uploadFiles==null){
            return;
        }

        String path =  UriUtils.getPath(this, result);
        if (StrUtils.isNullOrBlank(path)) {
            uploadFile.onReceiveValue(null);
            uploadFile = null;
            return;
        }
        File selectedPic=new File(path);
        Uri uri = Uri.fromFile(selectedPic);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP || uploadFile==null) {
            uploadFiles.onReceiveValue(new Uri[]{uri});
        } else {
            uploadFile.onReceiveValue(uri);
        }
        uploadFile = null;
        uploadFiles=null;
    }
