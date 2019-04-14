package cz.mg.vulkan;

public class PFNvkCmdDebugMarkerBeginEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerBeginEXT() {
    }

    public PFNvkCmdDebugMarkerBeginEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDebugMarkerBeginEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDebugMarkerBeginEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerBeginEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerBeginEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), pMarkerInfo != null ? pMarkerInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pMarkerInfo);
}
