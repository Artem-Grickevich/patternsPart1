package adapter;

public class FormatSongAdapter implements ISong{

    private ExternalSource externalSource;

    public FormatSongAdapter(ExternalSource externalSource) {
        this.externalSource = externalSource;
    }

    private String convertYmlToJson(ExternalSource externalSource, String endpoint) {
        return "Convert " + externalSource.getExternalData(endpoint) + "  to string json";
    }

    @Override
    public String getSong(String endpoint) {
        return convertYmlToJson(externalSource, endpoint);
    }
}
