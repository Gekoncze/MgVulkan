package cz.mg.vulkan;

public class PFNvkCmdDrawIndirectCountAMD extends VkFunctionPointer {
    public PFNvkCmdDrawIndirectCountAMD() {
    }

    protected PFNvkCmdDrawIndirectCountAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndirectCountAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndirectCountAMD(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirectCountAMD(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirectCountAMD"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, VkBuffer countBuffer, long countBufferOffset, int maxDrawCount, int stride){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset, countBuffer != null ? countBuffer.getVkAddress() : VkPointer.getNullAddressNative(), countBufferOffset, maxDrawCount, stride);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride);

}
