package cz.mg.vulkan;

public class PFNvkCmdDebugMarkerInsertEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerInsertEXT() {
    }

    public PFNvkCmdDebugMarkerInsertEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDebugMarkerInsertEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDebugMarkerInsertEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerInsertEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerInsertEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), pMarkerInfo != null ? pMarkerInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pMarkerInfo);
}
