window.onload = () => {

    const menu = () => {

        let ativa = document.querySelector('.ativa')
        let desativa = document.querySelector('.desativa')
        let campo = document.querySelector('.menu_mobile ul')

        ativa.addEventListener("click", () => {

            if(campo.classList.contains('menuAparece')){
                campo.classList.remove('menuAparece')
            }

            else{
                campo.classList.add('menuAparece')
            }

        })

        desativa.addEventListener("click", () => {
            campo.classList.remove('menuAparece')
        })

    }

    menu()

    const hoverTime = () => {
        let box = document.querySelectorAll('.time-single')

        box.forEach((item, index) => {

            let redes = document.querySelectorAll('.redes')

            box[index].addEventListener('mouseover', () => {
                
                redes[index].classList.add('blockeff')
                
            })

            box[index].addEventListener('mouseout', () => {
                
                redes[index].classList.remove('blockeff')
                
            })

        })
    }

    hoverTime()

    const paises = () => {
        let acao = document.querySelectorAll('.txt')
        let ultimo = 0
        acao.forEach((item, index) => {

            let resposta = document.querySelectorAll(".resposta")

            acao[index].addEventListener('click', () => {
                
                let ultima = document.querySelectorAll(".resposta")[ultimo]
                let primeira = document.querySelectorAll(".resposta")[index]

                ultimo = index

                ultima.classList.remove("busca")
                primeira.classList.add('busca')

            })
        })
    }

    paises()
}
