package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageMemoryRequirementsInfo2.html">khronos documentation</a>
 **/
public class VulkanImageMemoryRequirementsInfo2 extends VulkanObject {
    public VulkanImageMemoryRequirementsInfo2(){
        super(new VkImageMemoryRequirementsInfo2());
    }

    public VulkanImageMemoryRequirementsInfo2(VkImageMemoryRequirementsInfo2 vk){
        super(vk);
    }

    @Override
    public VkImageMemoryRequirementsInfo2 getVk(){
        return (VkImageMemoryRequirementsInfo2) super.getVk();
    }
    public VulkanImageMemoryRequirementsInfo2(VulkanObject pNext, VulkanImage image) {
        super(new VkImageMemoryRequirementsInfo2(pNext.getVk(), image.getVk()));
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


    public static class Array extends VulkanImageMemoryRequirementsInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanImageMemoryRequirementsInfo2> {
        public Array(VkImageMemoryRequirementsInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageMemoryRequirementsInfo2.Array(count));
        }

        public Array(int count, VulkanImageMemoryRequirementsInfo2 o){
            this(new VkImageMemoryRequirementsInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkImageMemoryRequirementsInfo2.Array getVk(){
            return (VkImageMemoryRequirementsInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageMemoryRequirementsInfo2 get(int i){
            return new VulkanImageMemoryRequirementsInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageMemoryRequirementsInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageMemoryRequirementsInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageMemoryRequirementsInfo2.Pointer(value));
        }

        @Override
        public VkImageMemoryRequirementsInfo2.Pointer getVk(){
            return (VkImageMemoryRequirementsInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageMemoryRequirementsInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageMemoryRequirementsInfo2.Pointer> {
            public Array(int count) {
                super(new VkImageMemoryRequirementsInfo2.Pointer.Array(count));
            }

            public Array(VulkanImageMemoryRequirementsInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageMemoryRequirementsInfo2.Pointer.Array getVk(){
                return (VkImageMemoryRequirementsInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageMemoryRequirementsInfo2.Pointer get(int i){
                return new VulkanImageMemoryRequirementsInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
