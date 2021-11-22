$(function () {

    $('#studentDialog').dialog({

        autoOpen: false,
        title: 'New Student',
        height: 300,
        width: 300,
        buttons: {
            Save: function f() {

            },

            Clear: function () {

            }
        }


    });

    $('#newButton').click(function () {
            $('#studentDialog').dialog('open');
    });
});