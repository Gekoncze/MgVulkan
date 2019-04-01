package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindVertexBuffers.html">khronos documentation</a>
 **/
public class PFNvkCmdBindVertexBuffers extends VkFunctionPointer {
    public PFNvkCmdBindVertexBuffers() {
    }

    public PFNvkCmdBindVertexBuffers(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBindVertexBuffers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBindVertexBuffers(long value) {
        setValue(value);
    }

    public PFNvkCmdBindVertexBuffers(VkInstance instance) {
        super(instance, new VkString("vkCmdBindVertexBuffers"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstBinding, VkUInt32 bindingCount, VkBuffer pBuffers, VkDeviceSize pOffsets){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, firstBinding != null ? firstBinding.getVkAddress() : VkPointer.NULL_ADDRESS, bindingCount != null ? bindingCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBuffers != null ? pBuffers.getVkAddress() : VkPointer.NULL, pOffsets != null ? pOffsets.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstBinding, long bindingCount, long pBuffers, long pOffsets);
}
