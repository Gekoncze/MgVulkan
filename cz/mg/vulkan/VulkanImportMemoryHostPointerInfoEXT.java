package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImportMemoryHostPointerInfoEXT.html">khronos documentation</a>
 **/
public class VulkanImportMemoryHostPointerInfoEXT extends VulkanObject {
    public VulkanImportMemoryHostPointerInfoEXT(){
        super(new VkImportMemoryHostPointerInfoEXT());
    }

    public VulkanImportMemoryHostPointerInfoEXT(VkImportMemoryHostPointerInfoEXT vk){
        super(vk);
    }

    @Override
    public VkImportMemoryHostPointerInfoEXT getVk(){
        return (VkImportMemoryHostPointerInfoEXT) super.getVk();
    }
    public VulkanImportMemoryHostPointerInfoEXT(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlagBits handleType, VulkanObject pHostPointer) {
        super(new VkImportMemoryHostPointerInfoEXT(pNext.getVk(), handleType.getVk(), pHostPointer.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VulkanExternalMemoryHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalMemoryHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }

    public VulkanObject getPHostPointer() {
        return new VulkanObject(getVk().getPHostPointer());
    }

    public void setPHostPointer(VulkanObject pHostPointer) {
        getVk().setPHostPointer(pHostPointer.getVk());
    }


    public static class Array extends VulkanImportMemoryHostPointerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanImportMemoryHostPointerInfoEXT> {
        public Array(VkImportMemoryHostPointerInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImportMemoryHostPointerInfoEXT.Array(count));
        }

        public Array(int count, VulkanImportMemoryHostPointerInfoEXT o){
            this(new VkImportMemoryHostPointerInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkImportMemoryHostPointerInfoEXT.Array getVk(){
            return (VkImportMemoryHostPointerInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImportMemoryHostPointerInfoEXT get(int i){
            return new VulkanImportMemoryHostPointerInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImportMemoryHostPointerInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImportMemoryHostPointerInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkImportMemoryHostPointerInfoEXT.Pointer(value));
        }

        @Override
        public VkImportMemoryHostPointerInfoEXT.Pointer getVk(){
            return (VkImportMemoryHostPointerInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanImportMemoryHostPointerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImportMemoryHostPointerInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkImportMemoryHostPointerInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanImportMemoryHostPointerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImportMemoryHostPointerInfoEXT.Pointer.Array getVk(){
                return (VkImportMemoryHostPointerInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImportMemoryHostPointerInfoEXT.Pointer get(int i){
                return new VulkanImportMemoryHostPointerInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
