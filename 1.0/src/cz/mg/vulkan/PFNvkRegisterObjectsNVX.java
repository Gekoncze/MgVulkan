package cz.mg.vulkan;

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

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObject ppObjectTableEntries, VkUInt32 pObjectIndices, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddress(), ppObjectTableEntries != null ? ppObjectTableEntries.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long objectTable, long objectCount, long ppObjectTableEntries, long pObjectIndices, long rval);
}
