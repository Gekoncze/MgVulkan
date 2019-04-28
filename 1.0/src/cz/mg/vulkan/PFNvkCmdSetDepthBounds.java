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

    public void call(VkCommandBuffer commandBuffer, VkFloat minDepthBounds, VkFloat maxDepthBounds){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), minDepthBounds != null ? minDepthBounds.getVkAddress() : VkPointer.getNullAddressNative(), maxDepthBounds != null ? maxDepthBounds.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long minDepthBounds, long maxDepthBounds);


    public void call(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), minDepthBounds, maxDepthBounds);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, float minDepthBounds, float maxDepthBounds);

}
