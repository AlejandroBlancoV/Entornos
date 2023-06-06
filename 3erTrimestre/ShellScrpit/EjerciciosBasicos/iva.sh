#!/bin/bash

IVA=21

echo "Introduce el precio"
read precio

IVA_amount=$(echo "$precio * $IVA / 100" | bc -l)

precio_final=$(echo "$precio + $IVA_amount"  | bc -l)

echo "El precio final es: $precio_final"