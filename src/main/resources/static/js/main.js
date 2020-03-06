$(document).ready(function()
var planeTable = $('#planeTable').DataTable({
ajax: {
            url: 'api/airplane',
            dataSrc: ''
        },
        columns: [
            { data: 'id' },
            { data: 'name' },
            { data: 'fuel' },

            {
                data: null,
                render: function (data, type, row) {
                    return '<td><button>DELETE ' + data.id + '</button></td>';
                }
            }
})

)
function getAirPort({
$.get
});