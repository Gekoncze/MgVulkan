package cz.mg.vulkan;

public class PFNvkCmdDrawIndexedIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndexedIndirect() {
    }

    protected PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexedIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexedIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexedIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int drawCount, int stride){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset, drawCount, stride);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long buffer, long offset, int drawCount, int stride);

}
