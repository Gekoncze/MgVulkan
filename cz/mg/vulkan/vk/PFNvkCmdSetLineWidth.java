package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetLineWidth.html">khronos documentation</a>
 **/
public class PFNvkCmdSetLineWidth extends VkFunctionPointer {
    public PFNvkCmdSetLineWidth() {
    }

    public PFNvkCmdSetLineWidth(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetLineWidth(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetLineWidth(long value) {
        setValue(value);
    }

    public PFNvkCmdSetLineWidth(VkInstance instance) {
        super(instance, new VkString("vkCmdSetLineWidth"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat lineWidth){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long lineWidth);
}
