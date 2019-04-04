package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSparseMemoryRequirementsInfo2.html">khronos documentation</a>
 **/
public class VulkanImageSparseMemoryRequirementsInfo2 extends VulkanObject {
    public VulkanImageSparseMemoryRequirementsInfo2(){
        super(new VkImageSparseMemoryRequirementsInfo2());
    }

    public VulkanImageSparseMemoryRequirementsInfo2(VkImageSparseMemoryRequirementsInfo2 vk){
        super(vk);
    }

    @Override
    public VkImageSparseMemoryRequirementsInfo2 getVk(){
        return (VkImageSparseMemoryRequirementsInfo2) super.getVk();
    }
    public VulkanImageSparseMemoryRequirementsInfo2(VulkanObject pNext, VulkanImage image) {
        super(new VkImageSparseMemoryRequirementsInfo2(pNext.getVk(), image.getVk()));
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

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
    }


    public static class Array extends VulkanImageSparseMemoryRequirementsInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanImageSparseMemoryRequirementsInfo2> {
        public Array(VkImageSparseMemoryRequirementsInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageSparseMemoryRequirementsInfo2.Array(count));
        }

        public Array(int count, VulkanImageSparseMemoryRequirementsInfo2 o){
            this(new VkImageSparseMemoryRequirementsInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkImageSparseMemoryRequirementsInfo2.Array getVk(){
            return (VkImageSparseMemoryRequirementsInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageSparseMemoryRequirementsInfo2 get(int i){
            return new VulkanImageSparseMemoryRequirementsInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageSparseMemoryRequirementsInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageSparseMemoryRequirementsInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageSparseMemoryRequirementsInfo2.Pointer(value));
        }

        @Override
        public VkImageSparseMemoryRequirementsInfo2.Pointer getVk(){
            return (VkImageSparseMemoryRequirementsInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageSparseMemoryRequirementsInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageSparseMemoryRequirementsInfo2.Pointer> {
            public Array(int count) {
                super(new VkImageSparseMemoryRequirementsInfo2.Pointer.Array(count));
            }

            public Array(VulkanImageSparseMemoryRequirementsInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageSparseMemoryRequirementsInfo2.Pointer.Array getVk(){
                return (VkImageSparseMemoryRequirementsInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageSparseMemoryRequirementsInfo2.Pointer get(int i){
                return new VulkanImageSparseMemoryRequirementsInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
