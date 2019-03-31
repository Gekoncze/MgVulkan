package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushConstants.html">khronos documentation</a>
 **/
public class PFNvkCmdPushConstants extends VkFunctionPointer {
    public PFNvkCmdPushConstants() {
    }

    public PFNvkCmdPushConstants(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdPushConstants(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdPushConstants(long value) {
        setValue(value);
    }

    public PFNvkCmdPushConstants(VkInstance instance) {
        super(instance, new VkString("vkCmdPushConstants"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, VkUInt32 offset, VkUInt32 size, VkObject pValues){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), layout != null ? layout.getVkAddress() : VkPipelineLayout.NULL.getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.NULL, offset != null ? offset.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL, pValues != null ? pValues.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long layout, long stageFlags, long offset, long size, long pValues);
}
