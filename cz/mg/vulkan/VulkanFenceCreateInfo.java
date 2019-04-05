package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFenceCreateInfo extends VulkanObject {
    public VulkanFenceCreateInfo(){
        super(new VkFenceCreateInfo());
    }

    public VulkanFenceCreateInfo(VkFenceCreateInfo vk){
        super(vk);
    }

    @Override
    public VkFenceCreateInfo getVk(){
        return (VkFenceCreateInfo) super.getVk();
    }
    public VulkanFenceCreateInfo(VulkanObject pNext, VulkanFenceCreateFlags flags) {
        super(new VkFenceCreateInfo(pNext.getVk(), flags.getVk()));
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

    public VulkanFenceCreateFlags getFlags() {
        return new VulkanFenceCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanFenceCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanFenceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateInfo> {
        public Array(VkFenceCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceCreateInfo.Array(count));
        }

        public Array(int count, VulkanFenceCreateInfo o){
            this(new VkFenceCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkFenceCreateInfo.Array getVk(){
            return (VkFenceCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceCreateInfo get(int i){
            return new VulkanFenceCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceCreateInfo.Pointer(value));
        }

        @Override
        public VkFenceCreateInfo.Pointer getVk(){
            return (VkFenceCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkFenceCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanFenceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceCreateInfo.Pointer.Array getVk(){
                return (VkFenceCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceCreateInfo.Pointer get(int i){
                return new VulkanFenceCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
