function exportResume() {
    let merCode = $("#merCode").textbox('getValue');
    window.location = '/javaZhou/fygift/finance/exportCategoryfyGift?merCode=' + merCode;
}