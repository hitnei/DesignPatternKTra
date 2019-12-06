

public class DatasourceFactory {
	public static final IDatasource createDatasource(DatasourceType datasourceType) {
		switch (datasourceType) {

		case SQLServerDatasource:
			return new SQLServerDatasource();

		case TextFileDatasource:
			return new TextFileDatasource();
			
		case FakeDatasource:
			return new FakeDatasource();

		default:
			throw new IllegalArgumentException("This datasource type is unsupported");
		}
	}
}
