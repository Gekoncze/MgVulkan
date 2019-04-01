package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDraw.html">khronos documentation</a>
 **/
public class PFNvkCmdDraw extends VkFunctionPointer {
    public PFNvkCmdDraw() {
    }

    public PFNvkCmdDraw(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDraw(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDraw(long value) {
        setValue(value);
    }

    public PFNvkCmdDraw(VkInstance instance) {
        super(instance, new VkString("vkCmdDraw"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 vertexCount, VkUInt32 instanceCount, VkUInt32 firstVertex, VkUInt32 firstInstance){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, vertexCount != null ? vertexCount.getVkAddress() : VkPointer.NULL_ADDRESS, instanceCount != null ? instanceCount.getVkAddress() : VkPointer.NULL_ADDRESS, firstVertex != null ? firstVertex.getVkAddress() : VkPointer.NULL_ADDRESS, firstInstance != null ? firstInstance.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long vertexCount, long instanceCount, long firstVertex, long firstInstance);
}
