const buttons = document.querySelectorAll('.btn-icon');
        buttons.forEach(button => {
            button.addEventListener('click', function() {
                const filter = this.getAttribute('data-filter');
                const characters = document.querySelectorAll('.character-button2');
                characters.forEach(character => {
                    if (filter === 'all' || character.classList.contains(filter)) {
                        character.style.display = 'block';
                    } else {
                        character.style.display = 'none';
                    }
                });
            });
        });
        const showAllButton = document.querySelector('.btn-show-all');
        showAllButton.addEventListener('click', function() {
            const characters = document.querySelectorAll('.character-button2');
            characters.forEach(character => {
                character.style.display = 'block';
            });
        });