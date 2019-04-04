package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImagePlaneMemoryRequirementsInfo.html">khronos documentation</a>
 **/
public class VulkanImagePlaneMemoryRequirementsInfo extends VulkanObject {
    public VulkanImagePlaneMemoryRequirementsInfo(){
        super(new VkImagePlaneMemoryRequirementsInfo());
    }

    public VulkanImagePlaneMemoryRequirementsInfo(VkImagePlaneMemoryRequirementsInfo vk){
        super(vk);
    }

    @Override
    public VkImagePlaneMemoryRequirementsInfo getVk(){
        return (VkImagePlaneMemoryRequirementsInfo) super.getVk();
    }
    public VulkanImagePlaneMemoryRequirementsInfo(VulkanObject pNext, VulkanImageAspectFlagBits planeAspect) {
        super(new VkImagePlaneMemoryRequirementsInfo(pNext.getVk(), planeAspect.getVk()));
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

    public VulkanImageAspectFlagBits getPlaneAspect() {
        return new VulkanImageAspectFlagBits(getVk().getPlaneAspect());
    }

    public void setPlaneAspect(VulkanImageAspectFlagBits planeAspect) {
        getVk().setPlaneAspect(planeAspect.getVk());
    }


    public static class Array extends VulkanImagePlaneMemoryRequirementsInfo implements cz.mg.collections.array.ReadonlyArray<VulkanImagePlaneMemoryRequirementsInfo> {
        public Array(VkImagePlaneMemoryRequirementsInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImagePlaneMemoryRequirementsInfo.Array(count));
        }

        public Array(int count, VulkanImagePlaneMemoryRequirementsInfo o){
            this(new VkImagePlaneMemoryRequirementsInfo.Array(count, o.getVk()));
        }

        @Override
        public VkImagePlaneMemoryRequirementsInfo.Array getVk(){
            return (VkImagePlaneMemoryRequirementsInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImagePlaneMemoryRequirementsInfo get(int i){
            return new VulkanImagePlaneMemoryRequirementsInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImagePlaneMemoryRequirementsInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImagePlaneMemoryRequirementsInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkImagePlaneMemoryRequirementsInfo.Pointer(value));
        }

        @Override
        public VkImagePlaneMemoryRequirementsInfo.Pointer getVk(){
            return (VkImagePlaneMemoryRequirementsInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanImagePlaneMemoryRequirementsInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImagePlaneMemoryRequirementsInfo.Pointer> {
            public Array(int count) {
                super(new VkImagePlaneMemoryRequirementsInfo.Pointer.Array(count));
            }

            public Array(VulkanImagePlaneMemoryRequirementsInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImagePlaneMemoryRequirementsInfo.Pointer.Array getVk(){
                return (VkImagePlaneMemoryRequirementsInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImagePlaneMemoryRequirementsInfo.Pointer get(int i){
                return new VulkanImagePlaneMemoryRequirementsInfo.Pointer(getVk().get(i));
            }
        }
    }
}
