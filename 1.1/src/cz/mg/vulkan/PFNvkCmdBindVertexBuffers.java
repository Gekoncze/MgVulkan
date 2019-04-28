package cz.mg.vulkan;

public class PFNvkCmdBindVertexBuffers extends VkFunctionPointer {
    public PFNvkCmdBindVertexBuffers() {
    }

    protected PFNvkCmdBindVertexBuffers(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBindVertexBuffers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBindVertexBuffers(long value) {
        setValue(value);
    }

    public PFNvkCmdBindVertexBuffers(VkInstance instance) {
        super(instance, new VkString("vkCmdBindVertexBuffers"));
    }

    public void call(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, VkBuffer pBuffers, VkDeviceSize pOffsets){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstBinding, bindingCount, pBuffers != null ? pBuffers.getVkAddress() : VkPointer.NULL, pOffsets != null ? pOffsets.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets);

}
