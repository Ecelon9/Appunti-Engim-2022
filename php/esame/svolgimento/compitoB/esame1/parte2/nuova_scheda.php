<?php
// link a elenco.php
echo '<a href="elenco.php?">Elenco</a>';

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    $data['tipo'] = $_POST['tipo'] ?? 'altro';
    $data['nome'] = $_POST['nome'] ?? '';
    $data['carattere'] = $_POST['carat'] ?? '';
    $data['alimentazione'] = $_POST['alimentazione'] ?? '';
    $data['genitori'] = $_POST['genitori'] ?? '';
    $data['nascita'] = $_POST['nascita'] ?? '';
    $data['prezzo'] = $_POST['prezzo'] ?? 0;
    $data['stato'] = $_POST['stato'] ?? 'disponibile';
    $json_data = json_encode($data);
    $dir = 'schede';
    if(!file_exists($dir)){
        mkdir($dir);
        }
    $filename = $dir . '/' . 'codice_' . date("H:i:s") . '.json';
    file_put_contents($filename, $json_data);

}

echo '<form method="post">
        Tipo:
        Cane <input type="radio" name="tipo" value="cane">
        Gatto <input type="radio" name="tipo" value="gatto">
        Altro <input type="radio" name="tipo" value="altro"><br><br>
        Nome: <input type="text" name="nome"><br><br>
        Carattere:
        Socievole <input type="radio" name="carattere" value="socievole">
        Aggresivo <input type="radio" name="carattere" value="aggresivo"><br><br>
        Alimentazione: <input type="text" name="alimentazione"><br><br>
        Genitori e storia:<br>
        <textarea name="genitori" cols="60" rows="10"></textarea><br><br>
        Anni di nascita: <input type="number" name="nascita"><br><br>
        Prezzo: <input type="number" name="prezzo"><br><br>
        Stato:
        Disponibile <input type="radio" name="stato" value="disponibile">
        Venduto <input type="radio" name="stato" value="venduto"><br><br>
        <input type="submit" value="Invia">
        </form>';

        

        