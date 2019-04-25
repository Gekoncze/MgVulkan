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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long lineWidth);
}
