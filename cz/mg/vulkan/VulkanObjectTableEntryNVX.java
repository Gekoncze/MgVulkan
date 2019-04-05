package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTableEntryNVX extends VulkanObject {
    public VulkanObjectTableEntryNVX(){
        super(new VkObjectTableEntryNVX());
    }

    public VulkanObjectTableEntryNVX(VkObjectTableEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableEntryNVX getVk(){
        return (VkObjectTableEntryNVX) super.getVk();
    }

    public VulkanObjectTableEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags) {
        super(new VkObjectTableEntryNVX(type.getVk(), flags.getVk()));
    }

    public VulkanObjectEntryTypeNVX getType() {
        return new VulkanObjectEntryTypeNVX(getVk().getType());
    }

    public void setType(VulkanObjectEntryTypeNVX type) {
        getVk().setType(type.getVk());
    }

    public VulkanObjectEntryUsageFlagsNVX getFlags() {
        return new VulkanObjectEntryUsageFlagsNVX(getVk().getFlags());
    }

    public void setFlags(VulkanObjectEntryUsageFlagsNVX flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanObjectTableEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableEntryNVX> {
        public Array(VkObjectTableEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableEntryNVX o){
            this(new VkObjectTableEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableEntryNVX.Array getVk(){
            return (VkObjectTableEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableEntryNVX get(int i){
            return new VulkanObjectTableEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTableEntryNVX.Pointer getVk(){
            return (VkObjectTableEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableEntryNVX.Pointer.Array getVk(){
                return (VkObjectTableEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableEntryNVX.Pointer get(int i){
                return new VulkanObjectTableEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
