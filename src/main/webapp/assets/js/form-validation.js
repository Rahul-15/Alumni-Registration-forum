let alumni_form = document.getElementById('alumni-details');
let organisation_form = document.getElementById('organisation_details');

alumni_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (alumni_form.checkValidity() === true) {
        console.log();
        let response = await fetch('api/alumni/register' ,{
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                email: document.getElementById('email').value,
                contact_Number: document.getElementById('contact_Number').value,
                id: sessionStorage.getItem('id'),

            })
        }).then(
            response => {
                if (response['status'] === 203) {
                    //confirm("right")
                    document.getElementById("login-success").style.display = "none";
                    document.getElementById("login-alert").style.display = "block";

                } else {
                    //console.log('wrong');
                    document.getElementById("login-alert").style.display = "none";
                    document.getElementById("login-success").style.display = "block";

                }
            }
        );
    } else {
        alumni_form.classList.add('was-validated');
    }
});

organisation_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (organisation_form.checkValidity() === true) {
        console.log();
        let response = await fetch('api/organisation/details' ,{
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                organisation_Name: document.getElementById('organisation_Name').value,
                postion: document.getElementById('postion').value,
                joining_Year: document.getElementById('joining_Year').value,
                leaving_Year: document.getElementById('leaving_Year').value,
                id: sessionStorage.getItem('id'),

            })
        }).then(
            response => {
                if (response['status'] === 203) {
                    //confirm("right")
                    document.getElementById("login-success2").style.display = "none";
                    document.getElementById("login-alert").style.display = "block";

                } else {
                    console.log('wrong');
                    document.getElementById("login-alert2").style.display = "none";
                    document.getElementById("login-success").style.display = "block";

                }
            }
        );
    } else {
        alumni_form.classList.add('was-validated');
    }
});
