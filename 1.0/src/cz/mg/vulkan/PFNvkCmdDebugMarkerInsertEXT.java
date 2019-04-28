package cz.mg.vulkan;

public class PFNvkCmdDebugMarkerInsertEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerInsertEXT() {
    }

    protected PFNvkCmdDebugMarkerInsertEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDebugMarkerInsertEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDebugMarkerInsertEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerInsertEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerInsertEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pMarkerInfo != null ? pMarkerInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pMarkerInfo);

}
