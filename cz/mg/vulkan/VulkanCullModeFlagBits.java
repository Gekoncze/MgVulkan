package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCullModeFlagBits.html">khronos documentation</a>
 **/
public class VulkanCullModeFlagBits extends VulkanFlagBits {
    public static final int NONE = VkCullModeFlagBits.VK_CULL_MODE_NONE;
    public static final int FRONT = VkCullModeFlagBits.VK_CULL_MODE_FRONT_BIT;
    public static final int BACK = VkCullModeFlagBits.VK_CULL_MODE_BACK_BIT;
    public static final int FRONT_AND_BACK = VkCullModeFlagBits.VK_CULL_MODE_FRONT_AND_BACK;

    public VulkanCullModeFlagBits(){
        super(new VkCullModeFlagBits());
    }

    public VulkanCullModeFlagBits(VkCullModeFlagBits vk){
        super(vk);
    }

    @Override
    public VkCullModeFlagBits getVk(){
        return (VkCullModeFlagBits) super.getVk();
    }

    public VulkanCullModeFlagBits(int value){
        super(new VkCullModeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == NONE) s += "NONE";
        if(getValue() == FRONT) s += "FRONT";
        if(getValue() == BACK) s += "BACK";
        if(getValue() == FRONT_AND_BACK) s += "FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCullModeFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanCullModeFlagBits> {
        public Array(VkCullModeFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCullModeFlagBits.Array(count));
        }

        public Array(int count, VulkanCullModeFlagBits o){
            this(new VkCullModeFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkCullModeFlagBits.Array getVk(){
            return (VkCullModeFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCullModeFlagBits get(int i){
            return new VulkanCullModeFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCullModeFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCullModeFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkCullModeFlagBits.Pointer(value));
        }

        @Override
        public VkCullModeFlagBits.Pointer getVk(){
            return (VkCullModeFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanCullModeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCullModeFlagBits.Pointer> {
            public Array(int count) {
                super(new VkCullModeFlagBits.Pointer.Array(count));
            }

            public Array(VulkanCullModeFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCullModeFlagBits.Pointer.Array getVk(){
                return (VkCullModeFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCullModeFlagBits.Pointer get(int i){
                return new VulkanCullModeFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
