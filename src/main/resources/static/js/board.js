

function boardWrite(){
    let form=$("#write")[0];
    let formData=new FormData(form);

    console.log(formData);
    $.ajax({
        url:"/board/write",
        data:formData,
        method:"POST",
        contentType:false,
        processData:false,
        success:function(data){

        }
    });
}