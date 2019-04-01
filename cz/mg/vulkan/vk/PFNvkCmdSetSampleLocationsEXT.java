package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetSampleLocationsEXT.html">khronos documentation</a>
 **/
public class PFNvkCmdSetSampleLocationsEXT extends VkFunctionPointer {
    public PFNvkCmdSetSampleLocationsEXT() {
    }

    public PFNvkCmdSetSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetSampleLocationsEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdSetSampleLocationsEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdSetSampleLocationsEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT pSampleLocationsInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pSampleLocationsInfo != null ? pSampleLocationsInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pSampleLocationsInfo);
}
