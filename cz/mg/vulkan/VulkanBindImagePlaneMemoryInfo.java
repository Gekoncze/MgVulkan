package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBindImagePlaneMemoryInfo extends VulkanObject {
    public VulkanBindImagePlaneMemoryInfo(){
        super(new VkBindImagePlaneMemoryInfo());
    }

    public VulkanBindImagePlaneMemoryInfo(VkBindImagePlaneMemoryInfo vk){
        super(vk);
    }

    @Override
    public VkBindImagePlaneMemoryInfo getVk(){
        return (VkBindImagePlaneMemoryInfo) super.getVk();
    }
    public VulkanBindImagePlaneMemoryInfo(VulkanObject pNext, VulkanImageAspectFlagBits planeAspect) {
        super(new VkBindImagePlaneMemoryInfo(pNext.getVk(), planeAspect.getVk()));
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


    public static class Array extends VulkanBindImagePlaneMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindImagePlaneMemoryInfo> {
        public Array(VkBindImagePlaneMemoryInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindImagePlaneMemoryInfo.Array(count));
        }

        public Array(int count, VulkanBindImagePlaneMemoryInfo o){
            this(new VkBindImagePlaneMemoryInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindImagePlaneMemoryInfo.Array getVk(){
            return (VkBindImagePlaneMemoryInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindImagePlaneMemoryInfo get(int i){
            return new VulkanBindImagePlaneMemoryInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindImagePlaneMemoryInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindImagePlaneMemoryInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindImagePlaneMemoryInfo.Pointer(value));
        }

        @Override
        public VkBindImagePlaneMemoryInfo.Pointer getVk(){
            return (VkBindImagePlaneMemoryInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindImagePlaneMemoryInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindImagePlaneMemoryInfo.Pointer> {
            public Array(int count) {
                super(new VkBindImagePlaneMemoryInfo.Pointer.Array(count));
            }

            public Array(VulkanBindImagePlaneMemoryInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindImagePlaneMemoryInfo.Pointer.Array getVk(){
                return (VkBindImagePlaneMemoryInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindImagePlaneMemoryInfo.Pointer get(int i){
                return new VulkanBindImagePlaneMemoryInfo.Pointer(getVk().get(i));
            }
        }
    }
}
