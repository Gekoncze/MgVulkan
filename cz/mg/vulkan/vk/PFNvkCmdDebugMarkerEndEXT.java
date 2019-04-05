package cz.mg.vulkan.vk;

public class PFNvkCmdDebugMarkerEndEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerEndEXT() {
    }

    public PFNvkCmdDebugMarkerEndEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDebugMarkerEndEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDebugMarkerEndEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerEndEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerEndEXT"));
    }

    public void call(VkCommandBuffer commandBuffer){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer);
}
