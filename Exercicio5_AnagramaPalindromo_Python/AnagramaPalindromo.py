def is_anagram_of_palindrome(input_string):
    char_count = {}

    # Conta a ocorrência de cada caractere na string
    for char in input_string:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1

    # Verifica quantos caracteres têm uma contagem ímpar
    odd_count = 0
    for count in char_count.values():
        if count % 2 != 0:
            odd_count += 1

    # Retorna True se houver no máximo um caractere com contagem ímpar (anagrama de palíndromo)
    return odd_count <= 1


# Exemplo de uso
input_string = input("Digite uma palavra: ")
result = is_anagram_of_palindrome(input_string)

print(result)
