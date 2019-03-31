package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetShaderInfoAMD.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPipeline.NULL.getVkAddress(), shaderStage != null ? shaderStage.getVkAddress() : VkPointer.NULL, infoType != null ? infoType.getVkAddress() : VkPointer.NULL, pInfoSize != null ? pInfoSize.getVkAddress() : VkPointer.NULL, pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipeline, long shaderStage, long infoType, long pInfoSize, long pInfo, long rval);
}
