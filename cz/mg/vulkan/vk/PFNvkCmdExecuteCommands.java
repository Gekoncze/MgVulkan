package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdExecuteCommands.html">khronos documentation</a>
 **/
public class PFNvkCmdExecuteCommands extends VkFunctionPointer {
    public PFNvkCmdExecuteCommands() {
    }

    public PFNvkCmdExecuteCommands(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdExecuteCommands(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdExecuteCommands(long value) {
        setValue(value);
    }

    public PFNvkCmdExecuteCommands(VkInstance instance) {
        super(instance, new VkString("vkCmdExecuteCommands"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.NULL_ADDRESS, pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long commandBufferCount, long pCommandBuffers);
}
