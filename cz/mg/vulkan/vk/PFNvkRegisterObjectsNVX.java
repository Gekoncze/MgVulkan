package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterObjectsNVX.html">khronos documentation</a>
 **/
public class PFNvkRegisterObjectsNVX extends VkFunctionPointer {
    public PFNvkRegisterObjectsNVX() {
    }

    public PFNvkRegisterObjectsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkRegisterObjectsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkRegisterObjectsNVX(long value) {
        setValue(value);
    }

    public PFNvkRegisterObjectsNVX(VkInstance instance) {
        super(instance, new VkString("vkRegisterObjectsNVX"));
    }

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectTableEntryNVX.Pointer ppObjectTableEntries, VkUInt32 pObjectIndices, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, objectTable != null ? objectTable.getVkAddress() : VkPointer.NULL_ADDRESS, objectCount != null ? objectCount.getVkAddress() : VkPointer.NULL_ADDRESS, ppObjectTableEntries != null ? ppObjectTableEntries.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long objectTable, long objectCount, long ppObjectTableEntries, long pObjectIndices, long rval);
}
