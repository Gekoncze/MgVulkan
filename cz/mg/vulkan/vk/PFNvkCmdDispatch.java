package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatch.html">khronos documentation</a>
 **/
public class PFNvkCmdDispatch extends VkFunctionPointer {
    public PFNvkCmdDispatch() {
    }

    public PFNvkCmdDispatch(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatch(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDispatch(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatch(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatch"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.NULL, groupCountY != null ? groupCountY.getVkAddress() : VkPointer.NULL, groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long groupCountX, long groupCountY, long groupCountZ);
}
