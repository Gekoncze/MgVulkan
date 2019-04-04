package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkColorComponentFlagBits.html">khronos documentation</a>
 **/
public class VulkanColorComponentFlagBits extends VulkanFlagBits {
    public static final int R = VkColorComponentFlagBits.VK_COLOR_COMPONENT_R_BIT;
    public static final int G = VkColorComponentFlagBits.VK_COLOR_COMPONENT_G_BIT;
    public static final int B = VkColorComponentFlagBits.VK_COLOR_COMPONENT_B_BIT;
    public static final int A = VkColorComponentFlagBits.VK_COLOR_COMPONENT_A_BIT;

    public VulkanColorComponentFlagBits(){
        super(new VkColorComponentFlagBits());
    }

    public VulkanColorComponentFlagBits(VkColorComponentFlagBits vk){
        super(vk);
    }

    @Override
    public VkColorComponentFlagBits getVk(){
        return (VkColorComponentFlagBits) super.getVk();
    }

    public VulkanColorComponentFlagBits(int value){
        super(new VkColorComponentFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == R) s += "R";
        if(getValue() == G) s += "G";
        if(getValue() == B) s += "B";
        if(getValue() == A) s += "A";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanColorComponentFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanColorComponentFlagBits> {
        public Array(VkColorComponentFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkColorComponentFlagBits.Array(count));
        }

        public Array(int count, VulkanColorComponentFlagBits o){
            this(new VkColorComponentFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkColorComponentFlagBits.Array getVk(){
            return (VkColorComponentFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanColorComponentFlagBits get(int i){
            return new VulkanColorComponentFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkColorComponentFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkColorComponentFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkColorComponentFlagBits.Pointer(value));
        }

        @Override
        public VkColorComponentFlagBits.Pointer getVk(){
            return (VkColorComponentFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanColorComponentFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanColorComponentFlagBits.Pointer> {
            public Array(int count) {
                super(new VkColorComponentFlagBits.Pointer.Array(count));
            }

            public Array(VulkanColorComponentFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkColorComponentFlagBits.Pointer.Array getVk(){
                return (VkColorComponentFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanColorComponentFlagBits.Pointer get(int i){
                return new VulkanColorComponentFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
