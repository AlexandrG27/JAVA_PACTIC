package Practice_31X.Homework2_1;
class AuthorTest
{
    Author aut;
    @BeforeEach
    public void createAuthor()
    {
        aut = new Author ("Ivan", "ivanz441@list.ru", 'm');
    }
    @org.junit.jupiter.api.Test
    void getName() {
        Assert.assertEquals("Ivan",aut.getName());
    }
    @org.junit.jupiter.api.Test
    void getEmail() {
        Assert.assertEquals("ivanz441@list.ru",aut.getEmail());
    }
}