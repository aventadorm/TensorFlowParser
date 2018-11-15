$sourceCode = Get-Content input.prototxt | foreach {
  $_.toCharArray()
  "|"
}
$sourceCode = -join $sourceCode
$sourceCode = $sourceCode.replace(" ", "")
#$sourceCode


$tokenFound = $null
$currentCharBuffer = $null

while($tokenFound -ne $null){

  #$tokenFound = $null
}

function isKey(){}
