android 中 webview 上传图片后，图片文件失去后缀的问题

根据 Uri 获取文件的真实路径, 然后再把真实路径转成 Uri. 这时候的 Uri 就是带文件真实名和后缀的. 

// 根据 Uri 获取文件真实路径的代码: https://gist.github.com/atearsan/1f0846e6dcdb3d8f3d1d 显示 Gist 代码

// 真实路径转成 Uri 的代码: Uri.fromFile(new File(filePath));

// Uri 打印结果: file:///storage/emulated/0/DCIM/Camera/IMG_20151006_193049.jpg
