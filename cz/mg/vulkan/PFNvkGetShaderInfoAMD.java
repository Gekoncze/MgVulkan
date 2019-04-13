package cz.mg.vulkan;

public class PFNvkGetShaderInfoAMD extends VkFunctionPointer {
    public PFNvkGetShaderInfoAMD() {
    }

    public PFNvkGetShaderInfoAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetShaderInfoAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetShaderInfoAMD(long value) {
        setValue(value);
    }

    public PFNvkGetShaderInfoAMD(VkInstance instance) {
        super(instance, new VkString("vkGetShaderInfoAMD"));
    }

    public void call(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, VkSize pInfoSize, VkObject pInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getSinkAddress(), shaderStage != null ? shaderStage.getVkAddress() : VkPointer.getSinkAddress(), infoType != null ? infoType.getVkAddress() : VkPointer.getSinkAddress(), pInfoSize != null ? pInfoSize.getVkAddress() : VkPointer.NULL, pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pipeline, long shaderStage, long infoType, long pInfoSize, long pInfo, long rval);
}
