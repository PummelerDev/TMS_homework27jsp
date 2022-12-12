<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Sign in</title>
</head>
<body style="background-color: black">

<div class="px-5 py-5 my-5 text-center" style="color: crimson">
    <div class="row align-items-center">
        <form action="/TMS_homework27jsp/signin" method="get" >
            <label class="visually-hidden" for="autoSizingInputGroup">Username</label>
            <div class="input-group">
                <input name="Username" type="text" class="form-control" id="autoSizingInputGroup" placeholder="Username"
                       required >
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label"></label>
                <input name="Password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
            </div>
            <button type="submit" class="btn btn-light">Sign in</button>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>