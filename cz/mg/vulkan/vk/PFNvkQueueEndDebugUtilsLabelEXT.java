package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueEndDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class PFNvkQueueEndDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueEndDebugUtilsLabelEXT() {
    }

    public PFNvkQueueEndDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueEndDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueEndDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueEndDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueEndDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue){
        call(getValue(), queue != null ? queue.getVkAddress() : VkQueue.NULL.getVkAddress());
    }

    private static native void call(long vkaddress, long queue);
}
