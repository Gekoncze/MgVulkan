package cz.mg.vulkan;

public class PFNvkGetShaderInfoAMD extends VkFunctionPointer {
    public PFNvkGetShaderInfoAMD() {
    }

    protected PFNvkGetShaderInfoAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetShaderInfoAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetShaderInfoAMD(long value) {
        setValue(value);
    }

    public PFNvkGetShaderInfoAMD(VkInstance instance) {
        super(instance, new VkString("vkGetShaderInfoAMD"));
    }

    public void call(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, VkSize pInfoSize, VkObject pInfo, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative(), shaderStage != null ? shaderStage.getVkAddress() : VkPointer.getNullAddressNative(), infoType != null ? infoType.getVkAddress() : VkPointer.getNullAddressNative(), pInfoSize != null ? pInfoSize.getVkAddress() : VkPointer.NULL, pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pipeline, long shaderStage, long infoType, long pInfoSize, long pInfo, long rval);


    public int call(VkDevice device, VkPipeline pipeline, int shaderStage, int infoType, VkSize pInfoSize, VkObject pInfo){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative(), shaderStage, infoType, pInfoSize != null ? pInfoSize.getVkAddress() : VkPointer.NULL, pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pipeline, int shaderStage, int infoType, long pInfoSize, long pInfo);

}
