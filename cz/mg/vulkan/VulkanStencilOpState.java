package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilOpState.html">khronos documentation</a>
 **/
public class VulkanStencilOpState extends VulkanObject {
    public VulkanStencilOpState(){
        super(new VkStencilOpState());
    }

    public VulkanStencilOpState(VkStencilOpState vk){
        super(vk);
    }

    @Override
    public VkStencilOpState getVk(){
        return (VkStencilOpState) super.getVk();
    }

    public VulkanStencilOpState(VulkanStencilOp failOp, VulkanStencilOp passOp, VulkanStencilOp depthFailOp, VulkanCompareOp compareOp, VulkanUInt32 compareMask, VulkanUInt32 writeMask, VulkanUInt32 reference) {
        super(new VkStencilOpState(failOp.getVk(), passOp.getVk(), depthFailOp.getVk(), compareOp.getVk(), compareMask.getVk(), writeMask.getVk(), reference.getVk()));
    }

    public VulkanStencilOp getFailOp() {
        return new VulkanStencilOp(getVk().getFailOp());
    }

    public void setFailOp(VulkanStencilOp failOp) {
        getVk().setFailOp(failOp.getVk());
    }

    public VulkanStencilOp getPassOp() {
        return new VulkanStencilOp(getVk().getPassOp());
    }

    public void setPassOp(VulkanStencilOp passOp) {
        getVk().setPassOp(passOp.getVk());
    }

    public VulkanStencilOp getDepthFailOp() {
        return new VulkanStencilOp(getVk().getDepthFailOp());
    }

    public void setDepthFailOp(VulkanStencilOp depthFailOp) {
        getVk().setDepthFailOp(depthFailOp.getVk());
    }

    public VulkanCompareOp getCompareOp() {
        return new VulkanCompareOp(getVk().getCompareOp());
    }

    public void setCompareOp(VulkanCompareOp compareOp) {
        getVk().setCompareOp(compareOp.getVk());
    }

    public VulkanUInt32 getCompareMask() {
        return new VulkanUInt32(getVk().getCompareMask());
    }

    public void setCompareMask(VulkanUInt32 compareMask) {
        getVk().setCompareMask(compareMask.getVk());
    }

    public VulkanUInt32 getWriteMask() {
        return new VulkanUInt32(getVk().getWriteMask());
    }

    public void setWriteMask(VulkanUInt32 writeMask) {
        getVk().setWriteMask(writeMask.getVk());
    }

    public VulkanUInt32 getReference() {
        return new VulkanUInt32(getVk().getReference());
    }

    public void setReference(VulkanUInt32 reference) {
        getVk().setReference(reference.getVk());
    }


    public static class Array extends VulkanStencilOpState implements cz.mg.collections.array.ReadonlyArray<VulkanStencilOpState> {
        public Array(VkStencilOpState.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkStencilOpState.Array(count));
        }

        public Array(int count, VulkanStencilOpState o){
            this(new VkStencilOpState.Array(count, o.getVk()));
        }

        @Override
        public VkStencilOpState.Array getVk(){
            return (VkStencilOpState.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanStencilOpState get(int i){
            return new VulkanStencilOpState(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkStencilOpState.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkStencilOpState.Pointer());
        }

        public Pointer(long value) {
            this(new VkStencilOpState.Pointer(value));
        }

        @Override
        public VkStencilOpState.Pointer getVk(){
            return (VkStencilOpState.Pointer) super.getVk();
        }

        public static class Array extends VulkanStencilOpState.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanStencilOpState.Pointer> {
            public Array(int count) {
                super(new VkStencilOpState.Pointer.Array(count));
            }

            public Array(VulkanStencilOpState[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkStencilOpState.Pointer.Array getVk(){
                return (VkStencilOpState.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanStencilOpState.Pointer get(int i){
                return new VulkanStencilOpState.Pointer(getVk().get(i));
            }
        }
    }
}
