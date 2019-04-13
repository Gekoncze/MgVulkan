package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), pSampleLocationsInfo != null ? pSampleLocationsInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pSampleLocationsInfo);
}
