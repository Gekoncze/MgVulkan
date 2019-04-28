package cz.mg.vulkan;

public class PFNvkCmdDebugMarkerBeginEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerBeginEXT() {
    }

    protected PFNvkCmdDebugMarkerBeginEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDebugMarkerBeginEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDebugMarkerBeginEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerBeginEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerBeginEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pMarkerInfo != null ? pMarkerInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pMarkerInfo);



}
