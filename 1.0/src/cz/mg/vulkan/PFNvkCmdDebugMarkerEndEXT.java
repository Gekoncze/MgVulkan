package cz.mg.vulkan;

public class PFNvkCmdDebugMarkerEndEXT extends VkFunctionPointer {
    public PFNvkCmdDebugMarkerEndEXT() {
    }

    protected PFNvkCmdDebugMarkerEndEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDebugMarkerEndEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDebugMarkerEndEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdDebugMarkerEndEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdDebugMarkerEndEXT"));
    }

    public void call(VkCommandBuffer commandBuffer){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer);



}
