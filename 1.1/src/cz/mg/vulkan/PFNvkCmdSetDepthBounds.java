package cz.mg.vulkan;

public class PFNvkCmdSetDepthBounds extends VkFunctionPointer {
    public PFNvkCmdSetDepthBounds() {
    }

    protected PFNvkCmdSetDepthBounds(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetDepthBounds(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDepthBounds(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBounds(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBounds"));
    }

    public void call(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), minDepthBounds, maxDepthBounds);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, float minDepthBounds, float maxDepthBounds);

}
