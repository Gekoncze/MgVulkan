package cz.mg.vulkan;

public class PFNvkCmdSetSampleLocationsEXT extends VkFunctionPointer {
    public PFNvkCmdSetSampleLocationsEXT() {
    }

    protected PFNvkCmdSetSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetSampleLocationsEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdSetSampleLocationsEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdSetSampleLocationsEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT pSampleLocationsInfo){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pSampleLocationsInfo != null ? pSampleLocationsInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pSampleLocationsInfo);



}
