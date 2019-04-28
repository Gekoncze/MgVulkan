package cz.mg.vulkan;

public class PFNvkCmdSetLineWidth extends VkFunctionPointer {
    public PFNvkCmdSetLineWidth() {
    }

    protected PFNvkCmdSetLineWidth(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetLineWidth(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetLineWidth(long value) {
        setValue(value);
    }

    public PFNvkCmdSetLineWidth(VkInstance instance) {
        super(instance, new VkString("vkCmdSetLineWidth"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat lineWidth){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long lineWidth);


    public void call(VkCommandBuffer commandBuffer, float lineWidth){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), lineWidth);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, float lineWidth);

}
